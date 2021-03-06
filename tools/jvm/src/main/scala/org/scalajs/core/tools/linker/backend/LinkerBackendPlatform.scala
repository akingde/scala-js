/*                     __                                               *\
**     ________ ___   / /  ___      __ ____  Scala.js tools             **
**    / __/ __// _ | / /  / _ | __ / // __/  (c) 2013-2017, LAMP/EPFL   **
**  __\ \/ /__/ __ |/ /__/ __ |/_// /_\ \    http://scala-js.org/       **
** /____/\___/_/ |_/____/_/ | |__/ /____/                               **
**                          |/____/                                     **
\*                                                                      */

package org.scalajs.core.tools.linker.backend

import org.scalajs.core.tools.linker.backend.closure.ClosureLinkerBackend

private[backend] object LinkerBackendPlatform {
  import LinkerBackend.Config

  def createLinkerBackend(config: Config): LinkerBackend = {
    if (config.closureCompiler)
      new ClosureLinkerBackend(config)
    else
      new BasicLinkerBackend(config)
  }
}
