class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        
          int n = quality.length;
        
        // Create an array of workers with quality and wage
        Worker[] workers = new Worker[n];
        for (int i = 0; i < n; i++) {
            workers[i] = new Worker(quality[i], wage[i]);
        }
        
        // Sort workers based on their wage/quality ratio
        Arrays.sort(workers, (a, b) -> Double.compare(a.getRatio(), b.getRatio()));
        
        // Use a max heap to keep track of the largest (k-1) quality values
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        int qualitySum = 0;
        double minCost = Double.MAX_VALUE;
        
        // Iterate over workers sorted by ratio
        for (Worker worker : workers) {
            maxHeap.offer(worker.quality);
            qualitySum += worker.quality;
            
            // If we have more than k workers, remove the one with the highest quality
            if (maxHeap.size() > k) {
                qualitySum -= maxHeap.poll(); // Remove the worker with the highest quality
            }
            
            // If we have exactly k workers, calculate the cost
            if (maxHeap.size() == k) {
                double currentCost = worker.getRatio() * qualitySum;
                minCost = Math.min(minCost, currentCost);
            }
        }
        
        return minCost;
    }

    // Worker class to represent each worker with quality and wage
    class Worker {
        int quality;
        int wage;
        
        public Worker(int quality, int wage) {
            this.quality = quality;
            this.wage = wage;
        }
        
        // Calculate the wage/quality ratio for the worker
        public double getRatio() {
            return (double) wage / quality;
        }
    }
}
        
        
    