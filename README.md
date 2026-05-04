### 1.Synchronization


### 2.Thread Priority


### 3. Producer and Consumer:


### 4. Dameon Thread

<h3>Daemon thread = “run in background, die with main thread”</h3>

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


### 🎯 🔹 Interview Answer

A daemon thread is a low-priority thread in the Java Thread API that runs in the background to support user threads. It does not prevent the JVM from exiting. Once all user threads are completed, the JVM automatically stops all daemon threads.

Common examples include:

* Garbage collection
* Auto-save systems
* Background logging
