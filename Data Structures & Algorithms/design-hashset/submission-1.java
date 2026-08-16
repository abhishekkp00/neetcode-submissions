class MyHashSet {

    private List<List<Integer>> buckets;
    private int size = 1000;

    public MyHashSet() {
        buckets = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            buckets.add(new ArrayList<>());
        }
    }

    public void add(int key) {
        int index = key % size;

        if (!buckets.get(index).contains(key)) {
            buckets.get(index).add(key);
        }
    }

    public void remove(int key) {
        int index = key % size;

        buckets.get(index).remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        int index = key % size;

        return buckets.get(index).contains(key);
    }
}