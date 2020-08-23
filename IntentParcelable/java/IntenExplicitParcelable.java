package com.example.intent_explicit_dengan_parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class IntenExplicitParcelable implements Parcelable {
    private String name;
    private int age;
    private String email;
    private String city;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.age);
        dest.writeString(this.email);
        dest.writeString(this.city);
    }

    public IntenExplicitParcelable() {
    }

    protected IntenExplicitParcelable(Parcel in) {
        this.name = in.readString();
        this.age = in.readInt();
        this.email = in.readString();
        this.city = in.readString();
    }

    public static final Parcelable.Creator<IntenExplicitParcelable> CREATOR = new Parcelable.Creator<IntenExplicitParcelable>() {
        @Override
        public IntenExplicitParcelable createFromParcel(Parcel source) {
            return new IntenExplicitParcelable(source);
        }

        @Override
        public IntenExplicitParcelable[] newArray(int size) {
            return new IntenExplicitParcelable[size];
        }
    };
}
