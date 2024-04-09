class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
            int n = tickets.length;
        Deque<Integer> queue = new ArrayDeque<>();
        int[] remainingTickets = tickets.clone();
        int time = 0;

        // Populate the queue with indices representing people in line
        for (int i = 0; i < n; i++) {
            queue.offer(i);
        }

        // Simulation loop
        while (remainingTickets[k] > 0) {
            int personIndex = queue.poll(); // Get the first person in line

            if (remainingTickets[personIndex] > 0) {
                // Process this person to buy a ticket
                remainingTickets[personIndex] -= 1;
                if (remainingTickets[personIndex] > 0) {
                    // If this person needs more tickets, put them back at the end of the queue
                    queue.offer(personIndex);
                }
            }

            time++; // Each ticket purchase takes 1 second
        }

        return time;
    }
    }
