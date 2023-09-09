class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        permutations.add(new ArrayList<>());

        for (int x : nums) {
            List<List<Integer>> temppermutations = new ArrayList<>();
            for (List<Integer> permutation : permutations) {
                for (int i = 0; i <= permutation.size(); i++) {
                    List<Integer> temppermutation = new ArrayList<>();
                    for (int j = 0; j < i; j++) {
                        temppermutation.add(permutation.get(j));
                    }
                    temppermutation.add(x);
                    for (int j = i; j < permutation.size(); j++) {
                        temppermutation.add(permutation.get(j));
                    }
                    temppermutations.add(temppermutation);
                }
            }
            permutations = temppermutations;
        }
        return permutations;
    }
}