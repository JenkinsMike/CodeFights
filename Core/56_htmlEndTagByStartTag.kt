fun htmlEndTagByStartTag(startTag: String): String {
    if(startTag.contains(' ')) {
        return '<' + startTag.substringBefore(' ').replace('<', '/') + '>'
    }
    else {
        return '<' + startTag.replace('<', '/')
    }
}