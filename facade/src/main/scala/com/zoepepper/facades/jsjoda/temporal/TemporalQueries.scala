package com.zoepepper.facades.jsjoda.temporal

import java.time.{ZoneId, ZoneOffset}
import java.time.chrono.Chronology
import java.time.temporal.TemporalUnit

import com.zoepepper.facades.jsjoda.{LocalDate, LocalTime}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("JSJoda.TemporalQueries")
object TemporalQueries extends scalajs.js.Object {
  def zoneId: TemporalQuery[ZoneId] = scalajs.js.native
  def chronology: TemporalQuery[Chronology] = scalajs.js.native
  def precision: TemporalQuery[TemporalUnit] = scalajs.js.native
  def zone: TemporalQuery[ZoneId] = scalajs.js.native
  def offset: TemporalQuery[ZoneOffset] = scalajs.js.native
  def localDate: TemporalQuery[LocalDate] = scalajs.js.native
  def localTime: TemporalQuery[LocalTime] = scalajs.js.native
}