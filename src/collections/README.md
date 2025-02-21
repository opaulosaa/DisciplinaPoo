# Colecctions
Aqui falaremos um pouco sobre as collections
#### 1 - Equals: para que funcione corretamente, os objetos precisam apontar para o **mesmo endereço de memória**. Caso contrário, será falso.
#### 1.1 - Sobrescrevendo o método equals: crtl + O. 
**Reflexivo**: x.equals(x) tem que ser true para tudo o que for diferente de null
**Simétrico**: para x e y diferentes de null. se x.equals(y) == true; y.equals(x) == true.
**Consistente**: x.equals(x) sempre retorna null se x for != null.
***
#### 2 - Hashcode: Criação de um número para busca num array grande.
Se x.equals(y) == true, y.hashCode(x) == x.hashCode()
y.hashCode() == x.hashCode () não necessariamente o y.equals(x) tem que ser true
x.equals(y) == false, hashCode diferente
y.hashCode() != x.hashCode(), x.equals(y) deverá ser false.
***
#### OBS: Notação Big O.
***
