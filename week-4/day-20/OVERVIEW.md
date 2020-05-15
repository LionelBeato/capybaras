# May 15, 2020 - Day 20

## Agenda 


## Outline

| Time   | Objective                        |
| -------|:---------------------------------|
| 1:00p  | Roll Call and settling in        |
| 1:10p  | Slides and examples              |
| 2:30p  | Break                            |
| 2:40p  | Slides and examples wrap-up      |
| 3:00p  | Assignment                       |
| 3:30p  | Lab time                         |
| 4:00p  | Break                            |
| 4:10p  | Lab time                         |
| 4:50p  | Retrospective                    |
| 5:00p  | Class is dismissed!              |

## Lab

### Host on Heroku

1. [Create a heroku account here](https://signup.heroku.com/dc).
2. Once you've created an account, [download the heroku CLI tool located here](https://devcenter.heroku.com/articles/heroku-cli).
3. After the CLI tool is installed, login to your heroku account locally by opening up a terminal and entering `heroku login`.
4. Navigate to the root of your Spring app. When you're there in your terminal, enter the command `heroku create`. This will initialize the project as a heroku app and create a remote for you to push to later.
5. Add the following line to your `application.properties`: `server.port=${PORT:8080}`. This line allows heroku to use dynamic ports on their end once your app is hosted.
6. Go through all of your git commands so that you're ready to push.
7. Once you're ready to push enter the command `git push heroku master` in your terminal and wait for heroku to resolve.
8. If successful, you should be given a URL that points to your now hosted app!

## Hand in Assignments

>these are expected to be handed in through TiTuS.

### Link to Heroku

1. Under deployment on TiTuS, hand in your assignment as a heroku link. If you could not get your link to work, you can instead hand it in as a github link.

## Notes and Links

- There are many hosting solutions for a modern app. One I'm partial to is [firebase](firebase.com).

- [repl.it](http://repl.it) is greate for quickly trying out other programming languages.

- [Go here to try out Windows Subsystem for Linux](https://ubuntu.com/wsl). This link is for the linux distro *Ubuntu* but there are many distros on the Microsoft Store.  

## Quote of the Day

```
 _________________________________________
/ Harrison's Postulate:                   \
|                                         |
| For every action, there is an equal and |
\ opposite criticism.                     /
 -----------------------------------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||
```
