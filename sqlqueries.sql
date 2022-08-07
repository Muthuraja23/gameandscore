create table sports (
sports_id  number(5),
sports_name varchar(20),
no_of_teams_per_game number(2),
max_players_perteam number(2),
primary key (sports_id)
);

create table game(
game_id number(5),
game_name varchar(30),
sports_id number(5),
start_date date,
start_time timestamp,
end_date date,
end_time timestamp,
result varchar(30),
primary key (game_id),
foreign key (sports_id)references sports(sports_id)
);

create table team(
team_id number(5),
team_name varchar(30),
start_date date,
total_players number(3),
country varchar(20),
state varchar(20),
address varchar(100),
status varchar(15),
owner varchar(30),
owner_phone number(10),
owner_email varchar(30),
primary key (team_id)
);

create table player(
player_id number(5),
player_name varchar(30),
DOB date,
gender varchar(10),
team_id  number(5),
skill varchar(15),
player_address varchar(100),
player_email varchar(30),
player_phone number(10),
player_aadhar number(12),
player_bloodgroup varchar(5),
player_height number(5),
player_weight number(3),
player_fees number(6),
player_grade varchar(5),
primary key (player_id),
foreign key (team_id)references team(team_id)
);

create table teamplayerdetails(
team_player_id number(5),
team_id number(5),
player_id number(5),
date_of_joining date,
status varchar(10),
date_of_leaving date,
primary key(team_player_id),
foreign key(team_id) references team(team_id),
foreign key (player_id) references player(player_id)
);

create table cr_scoreboard(
cr_scoreboard_id number(5),
game_id number(5),
team_id number(5),
total_runs number(3),
overs number(4),
total_wickets number(2),
result varchar(30),
primary key (cr_scoreboard_id),
foreign key (game_id) references game(game_id),
foreign key (team_id) references team(team_id)
);

create table cr_Sb_batting_details (
cr_batting_id number(5),
game_id number(5),
team_id number(5),
player_id number(5),
runs_scored number(3),
balls_faced number(3),
fours number(2),
sixes number(2),
dot_balls number(3),
status varchar(10),
primary key (cr_batting_id),
foreign key (game_id) references game(game_id),
foreign key (team_id) references team(team_id),
foreign key (player_id) references player(player_id)
);

create table cr_sb_bowling_details (
cr_bowling_id number(5),
game_id number(5),
team_id number(5),
player_id number(5),
overs_bowled number(5),
wickets_taken number(2),
dot_balls number(5),
wides number(2),
noball number(2),
runs_given number(3),
maiden_overs number(5),
primary key (cr_bowling_id),
foreign key (game_id) references game(game_id),
foreign key (team_id) references team(team_id),
foreign key (player_id) references player(player_id)
);

create table football_scoreboard(
fb_scoreboard_id number(5),
game_id number(5),
team_id number(5),
goals_scored number(5),
result varchar(30),
primary key (fb_scoreboard_id),
foreign key (game_id) references game(game_id),
foreign key (team_id) references team(team_id)
);

create table fb_sb_goals(
fb_goals_id number(5),
game_id number(5),
team_id number(5),
player_id number(5),
goal_scored number(5),
time timestamp,
fouls number(5),
tackles number(5),
assist number(5),
goal_attempt number(5),
penalty number(5),
corners number(5),
primary key (fb_goals_id),
foreign key (game_id) references game(game_id),
foreign key (team_id) references team(team_id),
foreign key (player_id) references player(player_id)
);

select * from hockey_scoreboard;
create table hockey_scoreboard(
h_scoreboard_id number(5),
game_id number(5),
team_id number(5),
goals_scored number(5),
result varchar(30),
primary key (h_scoreboard_id),
foreign key (game_id) references game(game_id),
foreign key (team_id) references team(team_id)
);

create table h_sb_goals(
h_scoreboard_id number(5),
game_id number(5),
team_id number(5),
player_id number(5),
goal_scored number(5),
time timestamp,
fouls number(5),
tackles number(5),
assist number(5),
goal_attempt number(5),
penalty number(5),
corners number(5),
primary key (h_scoreboard_id),
foreign key (game_id) references game(game_id),
foreign key (team_id) references team(team_id),
foreign key (player_id) references player(player_id)
);