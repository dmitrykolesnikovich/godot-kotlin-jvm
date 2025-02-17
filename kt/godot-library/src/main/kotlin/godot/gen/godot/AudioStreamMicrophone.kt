// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import kotlin.Suppress
import kotlin.Unit

/**
 * Plays real-time audio input data.
 *
 * Tutorials:
 * [https://github.com/godotengine/godot-demo-projects/tree/master/audio/mic_record](https://github.com/godotengine/godot-demo-projects/tree/master/audio/mic_record)
 *
 * When used directly in an [godot.AudioStreamPlayer] node, [godot.AudioStreamMicrophone] plays back microphone input in real-time. This can be used in conjunction with [godot.AudioEffectCapture] to process the data or save it.
 *
 * **Note:** [godot.ProjectSettings.audio/enableAudioInput] must be `true` for audio input to work. See also that setting's description for caveats related to permissions and operating system privacy settings.
 */
@GodotBaseType
public open class AudioStreamMicrophone : AudioStream() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_AUDIOSTREAMMICROPHONE)
  }
}
