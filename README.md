# android-orientation
android layout orientation for beginners

##### Step 1: Create a new project in Android Studio.
              Go to File ⇒ New Project and fill all required details to create a new project.
              
              
##### Step 2: Add the following code to res/layout/activity_main.xml.

<?xml version="1.0" encoding="utf-8"?>
<androidx.appcompat.widget.LinearLayoutCompat xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/background"
    android:gravity="center"
    android:orientation="vertical">

    <androidx.appcompat.widget.AppCompatEditText
        android:id="@+id/et_username"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginLeft="16dp"
        android:layout_marginRight="16dp"
        android:layout_marginBottom="16dp"
        android:background="@drawable/shape_corner"
        android:hint="@string/label_username"
        android:inputType="textPersonName"
        android:padding="16dp"
        android:imeOptions="actionNext"
        android:textAllCaps="false"
        android:textColor="@color/colorText"
        android:textColorHint="@color/colorTextHint"
        android:textSize="18sp"
        android:textStyle="italic" />

    <androidx.appcompat.widget.AppCompatEditText
        android:id="@+id/et_password"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginLeft="16dp"
        android:layout_marginRight="16dp"
        android:background="@drawable/shape_corner"
        android:hint="@string/label_password"
        android:inputType="numberPassword"
        android:padding="16dp"
        android:imeOptions="actionDone"
        android:textColor="@color/colorText"
        android:textColorHint="@color/colorTextHint"
        android:textSize="18sp"
        android:textStyle="italic" />

    <androidx.appcompat.widget.AppCompatButton
        android:id="@+id/btn_enter"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="26dp"
        android:background="@drawable/buttons"
        android:paddingStart="64dp"
        android:paddingEnd="64dp"
        android:text="@string/label_enter"
        android:textColor="@android:color/white"
        android:textSize="24sp"
        android:textStyle="italic" />

</androidx.appcompat.widget.LinearLayoutCompat>


##### Step 3: Create *layout-land* directory under *res* directory
              Right click on *res* directory ⇒ New ⇒ Android Resource Directory
              Resource type ⇒ layout
              Available qualifiers ⇒ Orientation ⇒⇒ Landscape ⇒ Ok
              
              
##### Step 4: Copy *activity_main.xml* from *res* directory to *layout-land* directory
              
              
##### Step 5: Replace the following code to res/layout-land/activity_main.xml.

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical">

    <androidx.appcompat.widget.AppCompatImageView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:scaleType="centerCrop"
        android:src="@drawable/background" />

    <androidx.appcompat.widget.LinearLayoutCompat
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:gravity="center"
        android:orientation="vertical">

        <androidx.appcompat.widget.LinearLayoutCompat
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

            <androidx.appcompat.widget.AppCompatEditText
                android:id="@+id/et_username"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_marginStart="32dp"
                android:layout_marginEnd="16dp"
                android:layout_weight="1"
                android:background="@drawable/shape_corner"
                android:hint="@string/label_username"
                android:imeOptions="actionNext"
                android:inputType="textPersonName"
                android:padding="15dp"
                android:textColor="@color/colorText"
                android:textColorHint="@color/colorTextHint"
                android:textSize="18sp"
                android:textStyle="italic" />

            <androidx.appcompat.widget.AppCompatEditText
                android:id="@+id/et_password"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_marginStart="16dp"
                android:layout_marginEnd="32dp"
                android:layout_weight="1"
                android:background="@drawable/shape_corner"
                android:hint="@string/label_password"
                android:imeOptions="actionDone"
                android:inputType="numberPassword"
                android:padding="16dp"
                android:textColor="@color/colorText"
                android:textColorHint="@color/colorTextHint"
                android:textSize="18sp"
                android:textStyle="italic" />
        </androidx.appcompat.widget.LinearLayoutCompat>

        <androidx.appcompat.widget.AppCompatButton
            android:id="@+id/btn_enter"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="26dp"
            android:background="@drawable/buttons"
            android:paddingStart="96dp"
            android:paddingEnd="96dp"
            android:text="@string/label_enter"
            android:textColor="@android:color/white"
            android:textSize="24sp"
            android:textStyle="italic" />
    </androidx.appcompat.widget.LinearLayoutCompat>
</RelativeLayout>


##### Step 6: Replace the following code to res/values/colors.xml.

```
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="colorPrimary">#455a64</color>
    <color name="colorPrimaryDark">#3B5663</color>
    <color name="colorPrimaryLite">#74718792</color>
    <color name="colorAccent">#718792</color>
    <color name="colorText">#FFFFFF</color>
    <color name="colorTextHint">#C2C1C1</color>
</resources>
```



##### Step 7: Replace the following code to res/values/colors.xml.

```
<resources>
    <string name="app_name">android-orientation</string>
    <string name="label_username">Username</string>
    <string name="label_password">Password</string>
    <string name="label_sign_up">Sign Up</string>
    <string name="label_sign_in">Sign In</string>
    <string name="label_enter">➣</string>
</resources>
```


##### Step 8: Copy files from res/drawable and paste these to your res/drawable

##### Step 9: Run app on your device. Voila! It's working!

### NB: Make sure your device orientation is set to auto.