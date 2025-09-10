# Solutions for Orientation Tasks 4 (Performance Variables)

## Task 1 (W) – Example case: Bank

Take a **bank service desk** as the system.

- **A (Arrived clients count):** Number of customers entering the bank.  
  *Example:* 200 clients arrive during a day.
- **C (Clients serviced count):** How many customers completed their transactions.  
  *Example:* 180 customers served, 20 left without service.
- **B (Busy time):** Total time the teller was occupied.  
  *Example:* 6 hours out of 8.
- **T (Total simulation time):** The length of observation.  
  *Example:* 8 hours.
- **U (Utilization = B/T):** Teller’s workload ratio.  
  *Example:* 6/8 = 75%.
- **X (Throughput = C/T):** Average customers served per time unit.  
  *Example:* 180/8 = 22.5 customers/hour.
- **S (Service time = B/C):** Average handling time per customer.  
  *Example:* 6 hours / 180 ≈ 2 minutes per client.
- **Rᵢ (Response time):** Waiting + service time for a specific client.  
  *Example:* waited 10 min + served 2 min → Rᵢ = 12 min.
- **W (Total waiting time):** Sum of all response times.  
  *Example:* 180 clients × avg 12 min = 2160 min.
- **R (Average response time = W/C):** Average throughput time per client.  
  *Example:* 2160/180 = 12 min.
- **N (Average queue length = W/T):** Average number of clients present.  
  *Example:* 2160/480 = 4.5 clients on average.