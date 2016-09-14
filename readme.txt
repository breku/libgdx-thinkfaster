./gradlew clean
./gradlew build


ANDROID
	android API 23 - android6
	24 nie działa, dostaję unsuported java major minor version 52
	linux 
		aby appt działał, chyba jakieś pakiety 32 bitowe
			sudo apt-get install lib32stdc++6
			sudo apt-get install lib32z1

HTML
./gradlew html:superDev
localhost:8080/html



DESKTOP
	workspace = android/assets
	Ubuntu rozpoznaje czasem 3 monitor, chociaż go nie ma. Jeżeli go odłączymy (OFF) aplikacja się nie uruchomi :/
		ArrayIndexOutOfBoundsException: 0 at org.lwjgl.opengl.LinuxDisplay.getAvailableDisplayModes
		Software & Updates
			Zmiana X.Org X server na NVIDIA binary driver 361.42 usuneła 3 monitor i dodatkowo można uruchomić desktop
	gradle desktop:run


IOS
	przechodzę do ios/
	gradle		



Aby zbudować finalne wersje projektu
https://github.com/libgdx/libgdx/wiki/Gradle-on-the-Commandline#packaging-for-the-desktop

