# Search tracks and artists in Chartmetric

Given a data set that contains tracks and artists I want to check in Chartmetric if those tracks are digitalized and exist in Chartmetric's DB.

- Call auth API to get the access token.
- Create a plain text file with the tracks and artists to be queried.
- Call Search Engine API to search tracks from the plain text file and validate if the artist's song is returned by the API

Test gets tracks from a plain text file to search them in Chartmetric Search Engine API and verifies if the artist of each song is contained in the body response returned by Chartmetric.

Test is performed using REST assured.

## Requirements

- Java SDK 17+
- Maven 3.8+

## API Reference

[Chartmetric docs](https://api.chartmetric.com/apidoc/)

#### Authorization - Get API access token

```
curl -d '{"refreshtoken":"REFRESH_TOKEN"}' -H "Content-Type: application/json" -X POST https://api.chartmetric.com/api/token
```

#### Search - Chartmetric Search Engine

```
curl -H 'Authorization: Bearer [ACCESS KEY]' https://api.chartmetric.com/api/search?type=tracks&q={track}
```
