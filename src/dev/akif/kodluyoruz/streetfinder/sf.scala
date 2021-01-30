package dev.akif.kodluyoruz.streetfinder


object StreetFinderImp extends StreetFinder{
  def findStreets(streets: List[String], names: Set[String]): List[String]={
    var result:List[String]=List()
    for (str <- streets ){
      for(name<-names){
        if(str.contains(name) && !result.contains(str) ){
            result=result:+str
        }
      }

    }
    result
  }
}
