### 1.Synchronization


### 2.Thread Priority


### 3. Producer and Consumer:


### 4. Dameon Thread

* A daemon thread is a background thread that runs to support other threads. It automatically stops when all user (main) threads finish.
* 🔹 Key Idea
Daemon thread runs in background
When main thread ends → daemon thread stops immediately
Used for:
Garbage collection
Background tasks (logging, monitoring)

* Imagine you’re working on a computer:

You are doing your main task (user thread)
In the background, an auto-save feature keeps saving your work (daemon thread)
When you close the app → auto-save stops automatically
