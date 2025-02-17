// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Boolean matrix.
 *
 * A two-dimensional array of boolean values, can be used to efficiently store a binary matrix (every matrix element takes only one bit) and query the values using natural cartesian coordinates.
 */
@GodotBaseType
public open class BitMap : Resource() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_BITMAP)
  }

  public open fun _getData(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_data is not implemented for BitMap")
  }

  public open fun _setData(arg0: Dictionary<Any?, Any?>): Unit {
  }

  /**
   * Returns an image of the same size as the bitmap and with a [enum Image.Format] of type `FORMAT_L8`. `true` bits of the bitmap are being converted into white pixels, and `false` bits into black.
   */
  public open fun convertToImage(): Image? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_CONVERT_TO_IMAGE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  /**
   * Creates a bitmap with the specified size, filled with `false`.
   */
  public open fun create(size: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_CREATE, NIL)
  }

  /**
   * Creates a bitmap that matches the given image dimensions, every element of the bitmap is set to `false` if the alpha value of the image at that position is equal to `threshold` or less, and `true` in other case.
   */
  public open fun createFromImageAlpha(image: Image, threshold: Double = 0.1): Unit {
    TransferContext.writeArguments(OBJECT to image, DOUBLE to threshold)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_CREATE_FROM_IMAGE_ALPHA, NIL)
  }

  /**
   * Returns bitmap's value at the specified position.
   */
  public open fun getBit(position: Vector2): Boolean {
    TransferContext.writeArguments(VECTOR2 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_GET_BIT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns bitmap's dimensions.
   */
  public open fun getSize(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_GET_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Returns the amount of bitmap elements that are set to `true`.
   */
  public open fun getTrueBitCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_GET_TRUE_BIT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Applies morphological dilation or erosion to the bitmap. If `pixels` is positive, dilation is applied to the bitmap. If `pixels` is negative, erosion is applied to the bitmap. `rect` defines the area where the morphological operation is applied. Pixels located outside the `rect` are unaffected by [growMask].
   */
  public open fun growMask(pixels: Long, rect: Rect2): Unit {
    TransferContext.writeArguments(LONG to pixels, RECT2 to rect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_GROW_MASK, NIL)
  }

  /**
   *
   */
  public open fun opaqueToPolygons(rect: Rect2, epsilon: Double = 2.0): VariantArray<Any?> {
    TransferContext.writeArguments(RECT2 to rect, DOUBLE to epsilon)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_OPAQUE_TO_POLYGONS, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Resizes the image to `new_size`.
   */
  public open fun resize(newSize: Vector2): Unit {
    TransferContext.writeArguments(VECTOR2 to newSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_RESIZE, NIL)
  }

  /**
   * Sets the bitmap's element at the specified position, to the specified value.
   */
  public open fun setBit(position: Vector2, bit: Boolean): Unit {
    TransferContext.writeArguments(VECTOR2 to position, BOOL to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_SET_BIT, NIL)
  }

  /**
   * Sets a rectangular portion of the bitmap to the specified value.
   */
  public open fun setBitRect(rect: Rect2, bit: Boolean): Unit {
    TransferContext.writeArguments(RECT2 to rect, BOOL to bit)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_BITMAP_SET_BIT_RECT, NIL)
  }
}
