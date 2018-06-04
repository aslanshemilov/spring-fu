package org.springframework.fu.sample

import org.springframework.core.env.get
import org.springframework.fu.configuration

val configuration = configuration {
	SampleConfiguration(property = env["ENV_VARIABLE"] ?: "debugConf")
}