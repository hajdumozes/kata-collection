scenario: either empty

- case 1: s1 is empty -> return -1
- case 2: s2 is empty -> return -1

scenario: one element

- case 3: both 1 char long -> return 0
- case 4: s1 is 1 char longer -> return 1
- case 5: s2 is 1 char longer -> return -1

scenario: multiple element

- case 6: length should be added, and compared