package net.ryancave282.mantle.data.loadable.field;

import com.google.gson.JsonObject;
import net.minecraft.network.FriendlyByteBuf;
import org.jetbrains.annotations.ApiStatus.NonExtendable;
import net.ryancave282.mantle.data.loadable.record.RecordLoadable;
import net.ryancave282.mantle.util.typed.TypedMap;

/**
 * Interface for a field in a JSON object, typically used in {@link RecordLoadable} but also usable statically.
 * TODO: should this just be merged into record field? It just adds some helpers that are not beneficial in rare cases.
 * @param <P>  Parent object
 * @param <T>  Loadable type
 */
public interface LoadableField<T,P> extends RecordField<T,P> {
  /** Same as {@link #get(JsonObject, TypedMap)} but passes {@link TypedMap#EMPTY} for context. */
  @NonExtendable
  default T get(JsonObject json) {
    return get(json, TypedMap.EMPTY);
  }

  /** Same as {@link #decode(FriendlyByteBuf, TypedMap)} but passes {@link TypedMap#EMPTY} for context. */
  @NonExtendable
  default T decode(FriendlyByteBuf buffer) {
    return decode(buffer, TypedMap.EMPTY);
  }
}
