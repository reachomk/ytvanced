package defpackage;

import android.media.session.PlaybackState;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xs */
public final class xs implements Parcelable {
    public static final Creator CREATOR = new xv();
    public final int a;
    public final long b;
    public final long c;
    public final float d;
    public final long e;
    public final int f;
    public final CharSequence g;
    public final long h;
    public final List i;
    public final long j;
    public final Bundle k;
    public PlaybackState l;

    xs(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List list, long j5, Bundle bundle) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = f;
        this.e = j3;
        this.f = i2;
        this.g = charSequence;
        this.h = j4;
        this.i = new ArrayList(list);
        this.j = j5;
        this.k = bundle;
    }

    public final int describeContents() {
        return 0;
    }

    xs(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readLong();
        this.d = parcel.readFloat();
        this.h = parcel.readLong();
        this.c = parcel.readLong();
        this.e = parcel.readLong();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = parcel.createTypedArrayList(xx.CREATOR);
        this.j = parcel.readLong();
        this.k = parcel.readBundle(wq.class.getClassLoader());
        this.f = parcel.readInt();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PlaybackState {");
        stringBuilder.append("state=");
        stringBuilder.append(this.a);
        stringBuilder.append(", position=");
        stringBuilder.append(this.b);
        stringBuilder.append(", buffered position=");
        stringBuilder.append(this.c);
        stringBuilder.append(", speed=");
        stringBuilder.append(this.d);
        stringBuilder.append(", updated=");
        stringBuilder.append(this.h);
        stringBuilder.append(", actions=");
        stringBuilder.append(this.e);
        stringBuilder.append(", error code=");
        stringBuilder.append(this.f);
        stringBuilder.append(", error message=");
        stringBuilder.append(this.g);
        stringBuilder.append(", custom actions=");
        stringBuilder.append(this.i);
        stringBuilder.append(", active item id=");
        stringBuilder.append(this.j);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        parcel.writeFloat(this.d);
        parcel.writeLong(this.h);
        parcel.writeLong(this.c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.g, parcel, i);
        parcel.writeTypedList(this.i);
        parcel.writeLong(this.j);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.f);
    }

    public static xs a(Object obj) {
        xs xsVar = null;
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        List list;
        PlaybackState playbackState = (PlaybackState) obj;
        List<Object> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList = new ArrayList(customActions.size());
            for (Object a : customActions) {
                arrayList.add(xx.a(a));
            }
            list = arrayList;
        } else {
            list = null;
        }
        if (VERSION.SDK_INT >= 22) {
            xsVar = playbackState.getExtras();
        }
        xs xsVar2 = new xs(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), list, playbackState.getActiveQueueItemId(), xsVar);
        xsVar2.l = playbackState;
        return xsVar2;
    }
}
