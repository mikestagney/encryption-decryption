# Encryption Decryption

Run from command line arguments, using Strategy design pattern to implement two different shifting encryption algorithms.

## Things learned

Regular expressions used for first time

Strategy Design pattern 

Parsing command line arguments

### Details

Uses two different shifting algorithms, one using the alphabet, the other using the Unicode table.

Fifth project created for JetBrains Academy Java Developer course - medium level project.

### How to Run

The program parses 6 arguments: -mode, -key, -data, -in, -out and -alg.
  
-mode: The programs mode (enc for encryption, dec for decryption)

-key: integer key to modify the message

-data: text or ciphertext to encrypt or decrypt

-in: name of text file to read in

-out: name of text file to write out

-alg: algorithm to use (shift or unicode)

### Sample input and output:

Example 1

java Main -mode enc -in road_to_treasure.txt -out protected.txt -key 5 -alg unicode

This command must get data from the file road_to_treasure.txt, encrypt the data with the key 5, create a file called protected.txt and write ciphertext to it.


Example 2

Input:

java Main -mode enc -key 5 -data "Welcome to hyperskill!" -alg unicode

Output: \jqhtrj%yt%m~ujwxpnqq&


Example 3

Input:

java Main -key 5 -alg unicode -data "\jqhtrj%yt%m~ujwxpnqq&" -mode dec

Output: Welcome to hyperskill!


Example 4:

Input:

java Main -key 5 -alg shift -data "Welcome to hyperskill!" -mode enc

Output: Bjqhtrj yt mdujwxpnqq!


Example 5:

Input:

java Main -key 5 -alg shift -data "Bjqhtrj yt mdujwxpnqq!" -mode dec

Output: Welcome to hyperskill!
