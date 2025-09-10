
## Task 4 (W) – Event scheduling algorithm

INITIALIZE simulation (set clock = 0, event list with initial arrivals)

WHILE (simulation not finished) DO
// A-phase
SELECT next event from event list
ADVANCE clock to time of next event

    // B-phase
    EXECUTE all B-events scheduled for current time
    (update system state, schedule new future events)

    // C-phase
    REPEAT
        CHECK all possible C-events
        IF conditions are satisfied THEN
            EXECUTE C-event
            SCHEDULE corresponding B-event
        ENDIF
    UNTIL no further C-events can be executed
END WHILE

PRINT results
