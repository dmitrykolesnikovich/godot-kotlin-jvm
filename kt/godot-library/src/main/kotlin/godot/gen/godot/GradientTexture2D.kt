// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Gradient-filled 2D texture.
 *
 * The texture uses a [godot.Gradient] to fill the texture data in 2D space. The gradient is filled according to the specified [fill] and [repeat] types using colors obtained from the gradient. The texture does not necessarily represent an exact copy of the gradient, but instead an interpolation of samples obtained from the gradient at fixed steps (see [width] and [height]). See also [godot.GradientTexture] and [godot.CurveTexture].
 */
@GodotBaseType
public open class GradientTexture2D : Texture() {
  /**
   * The gradient fill type, one of the [enum Fill] values. The texture is filled by interpolating colors starting from [fillFrom] to [fillTo] offsets.
   */
  public open var fill: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE2D_GET_FILL, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE2D_SET_FILL, NIL)
    }

  /**
   * The initial offset used to fill the texture specified in UV coordinates.
   */
  public open var fillFrom: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE2D_GET_FILL_FROM,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE2D_SET_FILL_FROM,
          NIL)
    }

  /**
   * The final offset used to fill the texture specified in UV coordinates.
   */
  public open var fillTo: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE2D_GET_FILL_TO,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE2D_SET_FILL_TO,
          NIL)
    }

  /**
   * The [godot.Gradient] used to fill the texture.
   */
  public open var gradient: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE2D_GET_GRADIENT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Gradient?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE2D_SET_GRADIENT,
          NIL)
    }

  /**
   * The number of vertical color samples that will be obtained from the [godot.Gradient], which also represents the texture's height.
   */
  public open var height: Long
    @JvmName("getHeight_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getHeight()
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE2D_SET_HEIGHT, NIL)
    }

  /**
   * The gradient repeat type, one of the [enum Repeat] values. The texture is filled starting from [fillFrom] to [fillTo] offsets by default, but the gradient fill can be repeated to cover the entire texture.
   */
  public open var repeat: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE2D_GET_REPEAT,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE2D_SET_REPEAT, NIL)
    }

  /**
   * If `true`, the generated texture will support high dynamic range ([godot.Image.FORMAT_RGBAF] format). This allows for glow effects to work if [godot.Environment.glowEnabled] is `true`. If `false`, the generated texture will use low dynamic range; overbright colors will be clamped ([godot.Image.FORMAT_RGBA8] format).
   */
  public open var useHdr: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE2D_GET_USE_HDR,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE2D_SET_USE_HDR,
          NIL)
    }

  /**
   * The number of horizontal color samples that will be obtained from the [godot.Gradient], which also represents the texture's width.
   */
  public open var width: Long
    @JvmName("getWidth_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getWidth()
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE2D_SET_WIDTH, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GRADIENTTEXTURE2D)
  }

  @CoreTypeHelper
  public open fun fillFrom(schedule: Vector2.() -> Unit): Vector2 = fillFrom.apply{
      schedule(this)
      fillFrom = this
  }


  @CoreTypeHelper
  public open fun fillTo(schedule: Vector2.() -> Unit): Vector2 = fillTo.apply{
      schedule(this)
      fillTo = this
  }


  public open fun _queueUpdate(): Unit {
  }

  public open fun _update(): Unit {
  }

  public enum class Fill(
    id: Long
  ) {
    /**
     * The colors are linearly interpolated in a straight line.
     */
    FILL_LINEAR(0),
    /**
     * The colors are linearly interpolated in a circular pattern.
     */
    FILL_RADIAL(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Repeat(
    id: Long
  ) {
    /**
     * The gradient fill is restricted to the range defined by [fillFrom] to [fillTo] offsets.
     */
    REPEAT_NONE(0),
    /**
     * The texture is filled starting from [fillFrom] to [fillTo] offsets, repeating the same pattern in both directions.
     */
    REPEAT(1),
    /**
     * The texture is filled starting from [fillFrom] to [fillTo] offsets, mirroring the pattern in both directions.
     */
    REPEAT_MIRROR(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * The colors are linearly interpolated in a straight line.
     */
    public final const val FILL_LINEAR: Long = 0

    /**
     * The colors are linearly interpolated in a circular pattern.
     */
    public final const val FILL_RADIAL: Long = 1

    /**
     * The texture is filled starting from [fillFrom] to [fillTo] offsets, repeating the same pattern in both directions.
     */
    public final const val REPEAT: Long = 1

    /**
     * The texture is filled starting from [fillFrom] to [fillTo] offsets, mirroring the pattern in both directions.
     */
    public final const val REPEAT_MIRROR: Long = 2

    /**
     * The gradient fill is restricted to the range defined by [fillFrom] to [fillTo] offsets.
     */
    public final const val REPEAT_NONE: Long = 0
  }
}
