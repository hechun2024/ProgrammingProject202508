# Orientation Tasks 2 – Writing Tasks


## Task 4 (W)

**Continue the three-phase simulation example until one client of type Y exits the system.**


# Call Centre Simulation – From Clock 16

---

## Table 2.12 Call centre simulation: clock = 16 (events B4, B3)

### Model Status
| Phase | Router queue | Router | Oper. 1 queue | Oper. 1 | Oper. 2 queue | Oper. 2 |
|-------|--------------|--------|---------------|---------|---------------|---------|
| B     | Empty        | Idle   | X3            | Idle    | Empty         | Y1      |
| C     | Empty        | Idle   | Empty         | X3      | Empty         | Y1      |

### Event List
| Event | Time |
|-------|------|
| B5    | 18   |
| B2    | 20   |
| B1    | 20   |
| B4    | 20   |

### Results
| Work complete | Count |
|---------------|-------|
| X             | 2     |
| Y             | 0     |

---

## Table 2.13 Call centre simulation: clock = 18 (event B5)

### Model Status
| Phase | Router queue | Router | Oper. 1 queue | Oper. 1 | Oper. 2 queue | Oper. 2 |
|-------|--------------|--------|---------------|---------|---------------|---------|
| B     | Empty        | Idle   | Empty         | X3      | Empty         | Idle    |
| C     | Empty        | Idle   | Empty         | X3      | Empty         | Idle    |

### Event List
| Event | Time |
|-------|------|
| B2    | 20   |
| B1    | 20   |
| B4    | 20   |

### Results
| Work complete | Count |
|---------------|-------|
| X             | 2     |
| Y             | 1     |


Therefore, the first Y-type client exits the system at **clock = 18 minutes**.














