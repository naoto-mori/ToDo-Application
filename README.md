# ToDo-Application
グループワーク用アプリ、機能をどんどん追加しましょう！

## 初期ではToDoを書き込み、表示させるだけの機能しか実装していません。
### 書き込みもデータベスの接続ではなく、<br>アプリケーションスコープに保存しています。

# 勉強に特化したToDoにしよう！
アプリの方向性とします。勉強の管理をしたい人が便利に扱えるようなアプリを目指します。<br>
アカウント登録制にします。
## [要件]
・ToDoを追加する際、タグをつけることでユーザが任意でカテゴリ分けできる。<br>
・ToDoを追加する際、任意で詳細を記述できる。<br>
・ToDoを追加する際、追加日が自動的に付与される。任意で完了目標日を設定できる。<br>
・ToDoの完了は、完了リストにストックしていく。この段階で削除はしない。<br>
・未完、完了のToDo共に削除することもできる。(完全削除)<br>
・追加したToDoはタグからソートをかけることができる。(完了リストも同様)<br>
# 機能一覧
## 機能をリストで書いていきます！
・アカウント作成機能<br>
・ログイン、ログアウト機能<br>
・ToDoの投稿及び表示<br>
・タグの一覧表示<br>
・ToDoの編集<br>
・ToDoの削除<br>
・ToDoの完了処理<br>
・ToDoのソート機能<br>
・ToDoの達成目標に近づいた際のアラート機能<br>
・ヘルプページの表示<br>

# データベース設計
## accountテーブル
|Column|Type|Options|
|------|----|-------|
|id|varchar(10)|primary_key|
|password|varchar(10)|not null|
|name|varchar(20)|not null

## todoテーブル
|Column|Type|Options|
|------|----|-------|
|todo_id|int|primary_key auto_increment|
|user_id|varchar(10)|not null|
|title|varchar(30)|not null|
|memo|varchar(500)| |
|tag|int|not null|
|post_day|date|not null|
|update_day|date|not null|
|dedline|date| |
|flag|int(1)|default 0|

## tagテーブル
|Column|Type|Options|
|------|----|-------|
|tag_id|int|primary_key auto_increment|
|name|varchar(10)|default else|
