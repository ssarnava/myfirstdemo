INSERT INTO PURCHASE_ORDER VALUES (1,'Order-1', 500, false, CURRENT_TIMESTAMP()-1);    
INSERT INTO PURCHASE_ORDER VALUES (2,'Order-2', 200, false, CURRENT_TIMESTAMP()-1);    
INSERT INTO PURCHASE_ORDER VALUES (3,'Order-3', 300, false, CURRENT_TIMESTAMP()); 
INSERT INTO PURCHASE_ORDER VALUES (4,'Order-4', 1600, false, CURRENT_TIMESTAMP()); 

INSERT INTO PRODUCT_ITEM VALUES (1,'Item-1', 100);
INSERT INTO PRODUCT_ITEM VALUES (2,'Item-2', 200);
INSERT INTO PRODUCT_ITEM VALUES (3,'Item-3', 300);

INSERT INTO ORDER_ITEM VALUES (1,1,1,1);
INSERT INTO ORDER_ITEM VALUES (2,1,2,2);
INSERT INTO ORDER_ITEM VALUES (3,2,2,1);
INSERT INTO ORDER_ITEM VALUES (4,3,3,1);
INSERT INTO ORDER_ITEM VALUES (5,4,1,1);
INSERT INTO ORDER_ITEM VALUES (6,4,2,2);
INSERT INTO ORDER_ITEM VALUES (7,4,3,3);

Select * from PURCHASE_ORDER;

git config --global user.name "sarnava"
git config --global user.email "ssarnavacareer@gmail.com"
git config --global user.password "Oems@022022"

git init
git add .
git commit -m "First commit"
git remote add origin https://github.com/ssarnava/myfirstdemo.git
git remote -v

git push origin master