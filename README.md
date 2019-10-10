# CAESAR-ENCRYPTION

The **Caesar cipher** is one of the earliest known and simplest ciphers. It is a type of substitution cipher in which each letter in the plaintext is 'shifted' a certain number of places down the alphabet. For example, with a shift of 1, **A** would be replaced by **B**, **B** would become **C**, and so on. The method is named after **Julius Caesar**, who apparently used it to communicate with his generals.

**__OPERATION__**

To pass an encrypted message from one person to another, it is first necessary that both parties have the **'key'** for the cipher, so that the sender may encrypt it and the receiver may decrypt it. For the caesar cipher, the key is **the number of characters to shift the cipher alphabet.**

**Mathematical Description** 
First we translate all of our characters to numbers, 'a'=0, 'b'=1, 'c'=2, ... , 'z'=25. We can now represent the caesar cipher encryption function, e(x), where x is the character we are encrypting, as:

e(x)=(x+k) (mod 26)

Where **k** is the key (the shift) applied to each letter. After applying this function the result is a number which must then be translated back into a letter. The decryption function is :

d(x)=(x-k)(mod 26)

**EXAMPLE**

Here is a quick example of the encryption and decryption steps involved with the caesar cipher. The text we will encrypt is 'defend the east wall of the castle', with a shift (key) of 1.

**plaintext**:  defend the east wall of the castle
**ciphertext**: efgfoe uif fbtu xbmm pg uif dbtumf

Here the ciphertext is 'mfuud htinsl' and the key is 5.

**ciphertext**: mfuud htinsl
**plaintext**:  happy coding
