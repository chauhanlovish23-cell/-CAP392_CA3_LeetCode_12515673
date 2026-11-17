
class Solution {
    public boolean isValidSerialization(String preorder) {
        int slots = 1;

        String[] arr = preorder.split(",");

        for (String s : arr) {

            if (slots == 0)
                return false;

            if (s.equals("#")) {
                slots--;
            } else {
                slots++;
            }
        }

        return slots == 0;
    }
}
