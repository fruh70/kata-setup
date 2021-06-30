### Feature name
password control

### Rules
Make the group explore and enumerate the business rules

1. 6 caractères minimum
2. au moins un chiffre
3. Au moins une lettre

### Examples
#### 6 caractères
1. abcde -> fail
2. abcd1 -> fail
3. abcdef -> success
4. ZYXWVU -> success
5. abCDef -> succes
6. abcDefg -> sucess
7. abcde1 -> success

#### Rule 2
#### Au moins 1 chiffres
1. 1 -> success
2. 12345 -> success
3. bc -> fail

#### Rule 3
#### Au moins 1 lettre
1. a -> success
2. alpha -> success
3. 22 -> fail
4. a1 -> success

#### Rule 1-2-3
1. alpha1 -> success
2. 1bcDefg -> success
3. abCDef1 -> success
4. beta1 -> fail