int[] arr = {1, 2, 3, 2};

HashSet<Integer> set = new HashSet<>();

for (int num : arr) {
    if (!set.add(num)) {
        System.out.println("Duplicate: " + num);
    }
}
