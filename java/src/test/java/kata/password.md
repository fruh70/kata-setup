### Feature name
password control

### Rules
Make the group explore and enumerate the business rules

1. 6 caractères minimum
2. au moins un chiffre
3. Au moins une lettre

### Examples
#### Rule 6CarMin
#### 6 caractères
1. abcde -> fail
2. abcd1 -> fail
3. abcdef -> success
4. ZYXWVU -> success
5. abCDef -> succes
6. abcDefg -> sucess
7. abcde1 -> success

#### Rule 1NumMin
#### Au moins 1 chiffres
1. 1 -> success
2. 12345 -> success
3. bc -> fail

#### Rule 1LetterMin
#### Au moins 1 lettre
1. a -> success
2. alpha -> success
3. 22 -> fail
4. a1 -> success

#### Rule 10CarMin
#### Au moins 10 caractères
1. alphabetag -> success
2. 1234567890 -> success
3. alpha2 -> fail
4. 6b6 -> fail
5. azertyqwerty -> fail

#### Rule 1SpecialCarMin
#### Au moins un caractère spécial
1. a@ -> success
2. !b$ -> success
3. ^cd -> success
4. a2b1 -> fail

#### Profil utilisateurs normaux : Rule 6CarMin-1NUmMin-1LettreMin
1. alpha1 -> success
2. 1bcDefg -> success
3. abCDef1 -> success
4. beta1 -> fail

#### Profil utilisateurs administrateurs : Rule 1NUmMin-1LettreMin-10CarMin-1CarSpecialMin
1. alpha1 -> fail
2. 