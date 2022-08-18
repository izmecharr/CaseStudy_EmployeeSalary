This is the first assignment given during 2nd year Computer Science student.

---

ASSIGNMENT 1.1
Attributes

load - floating point, defines how much balance is in the phone
network - character stating the network
ratePerText - floating point, defines how much a single text (length of 160) costs.
ratePerCall - floating point, defines how much a call costs per minute.

Methods

checkBalance - returns how much balance is left
call(minutes, network) - deducts call cost from balance, if different networks, cost is doubled.
text(length, network) - deducts text cost from balance, if different networks, cost is doubled.
reload(amount) - increases the balance of the account

---

ASSIGNMENT 1.2
Attributes

load - default: 0, cannot be negative.
network - default: 's', possible options = ['s', 't', 'g']
ratePerText - value is always 1
ratePerCall - depends on network ('s' - 3, 't' - 5, 'g' - 7)

---

ASSIGNMENT 1.3
Write a Runner program that will maximize the usage of the 📱 Mobile Phone object.
The user must be able to repeatedly perform different mobile phone operations as desired until the exit option is selected.

For this assessment task, you are expected to upload a java file that will satisfy the instructions above.
