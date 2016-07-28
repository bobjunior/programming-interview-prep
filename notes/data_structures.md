# Data Structures
## Hash Table
### Description
Hash tables provide fast lookup in the form of key-value pairs.

### Representation
array of linked lists
Binary Tree

### Implementation
1. Compute hash code key (int or long)
2. Map hash code to an index in an array (% array_length)
3. Store key and value in index

### Java Example
```java
import java.util.Hashtable;

// Create
Hashtable<String, String> ht = new Hashtable<String, String>();

// Add Entry
ht.put("key", "value");
ht.get("key");

// Get Keys
keys = ht.keys();

// Iterate
Iterator it = mp.entrySet().iterator();
while (it.hasNext())
        Map.Entry pair = (Map.Entry)it.next();
```

## ArrayList
### Description
Resizable Array

### Representation
Array that doubles in size if it runs out of space.

### Java Example
```java
// Create
ArrayList<Integer> al = new ArrayList<>();

// Add
al.add(10);

// Iterate
for (int i=0; i<al.size(); i++)
	al.get(i);

```

## Heap


