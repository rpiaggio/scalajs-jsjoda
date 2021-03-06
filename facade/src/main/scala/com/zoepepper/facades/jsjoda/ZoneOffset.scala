package com.zoepepper.facades.jsjoda

import com.zoepepper.facades.jsjoda.temporal._

import scalajs.js
import scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("JSJoda.ZoneOffset")
object ZoneOffset extends js.Object {
  def of(offsetId: String): ZoneOffset = js.native
  def ofHours(hours: Int): ZoneOffset = js.native
  def ofHoursMinutes(hours: Int, minutes: Int): ZoneOffset = js.native
  def ofHoursMinutesSeconds(hours: Int, minutes: Int, seconds: Int): ZoneOffset = js.native
  def ofTotalMinutes(totalMinutes: Int): ZoneOffset = js.native
  def ofTotalSeconds(totalSeconds: Int): ZoneOffset = js.native

  val UTC: ZoneOffset = js.native
  val MIN: ZoneOffset = js.native
  val MAX: ZoneOffset = js.native
}

@js.native
class ZoneOffset(seconds: Int) extends ZoneId with TemporalAccessor with TemporalAdjuster {
  def totalSeconds(): Int = js.native
  def compareTo(other: ZoneOffset): Int = js.native
}
