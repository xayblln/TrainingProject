public class Solution {
    public static String whoLikesIt(String... names) {
        StringBuilder dataLikers = new StringBuilder();
        switch (names.length) {
            case 0:
                dataLikers.append("no one likes this");
                break;
            case 1:
                dataLikers.append(names[0]).append(" likes this");
                break;
            case 2:
                dataLikers.append(names[0]).append(" and ").append(names[1]).append(" likes this");
                break;
            case 3:
                dataLikers.append(names[0]).append(", ").append(names[1])
                        .append(" and ").append(names[2]).append(" likes this");
                break;
            default:
                dataLikers.append(names[0]).append(", ").append(names[1])
                        .append(" and ").append(names.length - 2).append(" others likes this");
                break;
        }
        return dataLikers.toString();
    }
}