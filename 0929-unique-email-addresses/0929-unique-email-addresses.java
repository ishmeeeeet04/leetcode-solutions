class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set =
                new HashSet<>();

        for (String email : emails) {

            String[] parts =
                    email.split("@");

            String local =
                    parts[0];

            String domain =
                    parts[1];

            // remove after +
            int plusIndex =
                    local.indexOf('+');

            if (plusIndex != -1) {

                local =
                        local.substring(
                                0,
                                plusIndex);
            }

            // remove dots
            local =
                    local.replace(".",
                            "");

            // final email
            String finalEmail =
                    local + "@"
                            + domain;

            set.add(finalEmail);
        }

        return set.size();
    }
}