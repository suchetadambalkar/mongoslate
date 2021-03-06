# mongoslate
Mongoslate is a tool or API to translate SQL-like syntactic query language to MongoDB Query Language. It supports a SQL like syntactic [LL(*) grammar](https://github.com/atuldambalkar/mongoslate/tree/master/src/main/antlr3/com/entrib/mongoslate).

It uses ANTLR to parse the SQL-like queries and translate those to MongoDB Queries.

##Aggregation functions support
The tool supports following aggregation functions,
- sum
- count
- max
- min
- avg

##Support for Date operators
The tool also supports following operators for data types such as Date,
- year
- month
- week
- day_of_month
- day_of_week
- day_of_year
- hour
- minute
- second

##Support for String operators
It also supports following operators for strings,
- contains
- starts
- ends
- regex
- to_upper
- to_lower
  
##Geo-spatial query support

###Operator support

Following operators are supported in for the geo-spatial queries,
- near
- within

####Co-ordinate support
The tool supports specifying co-ordinates through operator,
- location

This also supports option for 'distance'.

###Shape support
The tool also supports following types of shapes in geo-spatial queries,
- box
- polygon
- circle

The above operators can be used in the SQL like queries which will get appropriately translated into Mongo query.
