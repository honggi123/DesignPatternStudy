package com.example.designpatternstudy.Proxy.Protecting

data class ExUser(
     var nickname : String,
     var isMaster : Boolean = false,
     var isBanned : Boolean = false
)
