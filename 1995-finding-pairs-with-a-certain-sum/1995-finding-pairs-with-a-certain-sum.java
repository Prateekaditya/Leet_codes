class FindSumPairs {
    private int[] nums1; // \U0001f3e6 Warehouse 1: An array holding the items in the first warehouse.
    private int[] nums2; // \U0001f3e6 Warehouse 2: An array holding the *prices* of items in the second warehouse.
    private Map<Integer, Integer> counts; // \U0001f4dd A notebook (HashMap) to quickly look up how many times each price appears in warehouse 2. Think of it like a cheat sheet!

    public FindSumPairs(int[] nums1, int[] nums2) { // \U0001f477 Constructor: This is like the construction crew setting up the warehouses.
        this.nums1 = nums1; // \U0001f69a Unloading items into Warehouse 1.
        this.nums2 = nums2; // \U0001f4b0 Unloading price tags into Warehouse 2.
        this.counts = new HashMap<>(); // \U0001f4d2 Creating our cheat sheet (notebook).

        for (int num : nums2) { // \U0001f6b6 Walking through each price in Warehouse 2.
            counts.put(num, counts.getOrDefault(num, 0) + 1); // ✍️ Writing down how many times each price appears on our cheat sheet.
                                                                // Like counting how many items have the same price.
        }
    }

    public void add(int index, int val) { // ➕ Adding price to a certain item. This is like adjusting the price in our inventory system!
        int oldValue = nums2[index]; // \U0001f3f7️ Remembering the old price of the item.
        nums2[index] += val; // \U0001f4c8 Actually changing the price in Warehouse 2 (in our array).
        int newValue = nums2[index]; // \U0001f3f7️ Remembering the new price

        // Update the counts map

        counts.put(oldValue, counts.get(oldValue) - 1); // \U0001f4c9 Reduce count of old price. Think of it like deleting the count from the inventory

        // if price doesnt exist anymore, take it out
        if (counts.get(oldValue) == 0) { // \U0001f50d
            counts.remove(oldValue); // \U0001f5d1️
        }

        counts.put(newValue, counts.getOrDefault(newValue, 0) + 1); // \U0001f4c8 Add new price to total counts. Think of it like creating count for inventory
    }

    public int count(int tot) { // \U0001f3af Finding pairs of items that sum up to a total price 'tot'.
        int totalPairs = 0; // \U0001f4ca Starting our count of pairs from zero.
        for (int i = 0; i < nums1.length; i++) { // \U0001f6b6 Walking through each item (price) in Warehouse 1.
            int target = tot - nums1[i]; // \U0001f3af Figuring out what price we need from Warehouse 2 to reach our target 'tot'.
            totalPairs += counts.getOrDefault(target, 0); // \U0001f4d2 Looking up in our cheat sheet how many items in Warehouse 2 have the price we need!
        }
        return totalPairs; // \U0001f389 Returning the total number of pairs we found.
    }
}