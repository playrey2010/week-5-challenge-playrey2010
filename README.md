# week-5-challenge-playrey2010


[TOC]

#### Challenge description

> REQUIREMENTS
- You are to write an application that is kind of like Craigslist, but for jobs only. It will allow a user to post a job that someone needs, and everyone else has the ability to see all the jobs that have been posted.
- Users can edit and delete their own jobs.
- Build an application that allows users to add jobs, list jobs and view jobs.
- Your client has requested specifically for a unified look across all your pages. Your program manager has made these styling mandatory:
- Same navigation bar across all pages. 
- In the navigation bar, give your app a name (eg. "Taylor & Oscar's Wedding"), or a logo. Each button must have meaningful names (ie. "Home" is fine. "Link1" or "Page1" is not.)

#### New concepts applied

- How to query your database (search through all created objects)
- Apply uniform css style across multiple pages
- Designed a logo for favicon
- Imported google fonts across multiple pages
- Option to add jobs and move back to homepage provided in the *navbar*
- Using templates and modifying these to match site content
- LinkedIn Profile anchored at footer 
- use of fragments in the footer



#### Code snippet
```html
<!-- in base.html -->
<header th:fragment="fixed-navbar">

<!-- in other pages -->
<header th:replace="base :: fixed-navbar">
```
