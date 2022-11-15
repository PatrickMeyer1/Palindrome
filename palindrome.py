# Method verifying if a given word is a palindrome or not.
# Definition: A palindrome is a word that can be read the same backward or forwards
def palindrome(word):
    word = word.lower()
    word = word.replace(" ","")
    length = len(word)
    half_length = length//2
    for i in range(1, half_length + 1):
        if word[i-1] == word[-i]:
            print( word[i-1] + " is equal to " + word[-i] )
            if i == half_length:
                print("The word is a palindrome")
        else:
            print( word[i-1] + " is NOT equal to " + word[-i] )
            print("Thus, the word is NOT a palindrome")
            break


# Examples

# 'laval' is a palindrome
# 'lavval' is a palindrome
# 'lavaval' is a plaindrome
# 'laavval' is not a palindrome
