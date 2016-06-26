package java.time.chrono

import com.zoepepper.facades.jsjoda.chrono.{IsoChronology => IsoChronologyF}

import scala.language.implicitConversions

trait ChronoConversions {
  implicit def ic2ICF(f: IsoChronologyF): IsoChronology = new IsoChronology(f)
}