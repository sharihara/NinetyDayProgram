package NinetyDaysProgramDay2;

public class ReverseOfAlternateWords {

	public static void main(String[] args) {
		// Split each word from the sentence (separated by space or any special characters)
			String str[] = "When the world realise its own mistakes, corona will dissolve automatically".split("[\\s@&.?$+-]+");
			
			// Len of the given sentence
			int len = str.length;
			// Final answer to be printed
			String ans = "";
			// Alternate words that get reversed
			String revWords = "";
			// Traverse the entire sentence
			for (int i = 0; i < len; i++) {
				// Take each word
				String words = str[i];
				// Identify the alternative word to reverse
				if (i % 2 != 0) {
					// Traverse from right to left and accumulate the same in 'revWords'
					for (int j = words.length() - 1; j >= 0; j--) {
						revWords = revWords + words.charAt(j);
					}
					// Alternatively accumulate the same in the answer variable to preserve the order.
					ans = ans + revWords + " ";
					// Reset the revWords variable to reverse the next alternate word.
					revWords = "";
				}
				// Accumulate the words to answer variable which are next to the reversed Words.
				else
					ans = ans + str[i] + " ";
			}
			System.out.println(ans);
		}

	}


