package defpackage;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

/* renamed from: vo */
public final class vo implements Parcelable {
    public static final Creator CREATOR = new vr();
    public final int a;
    public final float b;
    private Object c;

    vo(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rating:style=");
        stringBuilder.append(this.a);
        stringBuilder.append(" rating=");
        float f = this.b;
        if (f < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public final int describeContents() {
        return this.a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }

    public static vo a(Object obj) {
        vo voVar = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        voVar = new vo(ratingStyle, -1.0f);
                        break;
                }
            }
            float f = 1.0f;
            String str = "Rating";
            float starRating;
            switch (ratingStyle) {
                case 1:
                    if (!rating.hasHeart()) {
                        f = 0.0f;
                    }
                    voVar = new vo(1, f);
                    break;
                case 2:
                    if (!rating.isThumbUp()) {
                        f = 0.0f;
                    }
                    voVar = new vo(2, f);
                    break;
                case 3:
                case 4:
                case 5:
                    starRating = rating.getStarRating();
                    if (ratingStyle == 3) {
                        f = 3.0f;
                    } else if (ratingStyle == 4) {
                        f = 4.0f;
                    } else if (ratingStyle != 5) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Invalid rating style (");
                        stringBuilder.append(ratingStyle);
                        stringBuilder.append(") for a star rating");
                        Log.e(str, stringBuilder.toString());
                        break;
                    } else {
                        f = 5.0f;
                    }
                    if (starRating < 0.0f || starRating > r3) {
                        Log.e(str, "Trying to set out of range star-based rating");
                        break;
                    }
                    voVar = new vo(ratingStyle, starRating);
                    break;
                    break;
                case 6:
                    starRating = rating.getPercentRating();
                    if (starRating < 0.0f || starRating > 100.0f) {
                        Log.e(str, "Invalid percentage-based rating value");
                        break;
                    }
                    voVar = new vo(6, starRating);
                    break;
                    break;
                default:
                    return null;
            }
            voVar.c = obj;
        }
        return voVar;
    }
}
