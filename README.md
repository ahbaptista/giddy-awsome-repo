# What
dynamic hot reload of env vars without bouncing services.

# How
open up your terminal and type `make`
this should build a consul docker and an app docker.

open http://localhost:8500/ui/dc1/kv in your browser
and create a new key dir, call it
```
superservice
```
under super service create any key value 

open http://localhost:8080/ in your browser, and now you will see app env vars.

when ever you update vars here
http://localhost:8500/ui/dc1/kv/superservice/

the vars will be updated here
http://localhost:8080/

# Why
because restarting services is expensive, and this can be used for feature toggling.

