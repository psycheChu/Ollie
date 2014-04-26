package ollie;

@ollie.annotation.TypeAdapter
public abstract class TypeAdapter<D, S> {
	public abstract <S> S serialize(D value);

	public abstract <D> D deserialize(S value);
}