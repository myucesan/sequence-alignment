**This solution is finished.**

The sequence alignment problem aims to find the optimal alignment of two strings such that the mismatch penalty is minimized. For each mismatched character, you should add a penalty of 1. This means we consider a missed character to be equally bad as any typo. E.g., both objection/abjection and hold it/hld it have a minimum sequence alignment cost of 1.

You are given two lowercase strings, of lengths 𝑛
and 𝑚
respectively. The lengths of the strings can be different. Your algorithm must calculate the minimum sequence alignment cost, and return it as an integer. An example input is given below.

```agsl
kitten
sitting  
```

This example should return 3 representing the two typos and one missing character.

For an extra challenge consider the problem description of sequence alignment as outlined in the book, in which the costs of gaps and typos are different. In fact, the cost for a typo depends on the letters used. For example on a QWERTY keyboard you may assign a lower penalty for mixing up a q with a w than mixing up a q with a y.

