#ifndef _H_SPACESHOOTER_APP_
#define _H_SPACESHOOTER_APP_


//#include	<memory.h>
#include	"Core/AGK_App.h"

#define	TITLE							"MemoryGame"
#define DEVICE_WIDTH					1024
#define DEVICE_HEIGHT					683
#define FULLSCREEN						false

// Global values for the app
class CMemoryGameApp : public AGK_App
{
public:
	// constructor
	CMemoryGameApp();
	~CMemoryGameApp() {}

	// main app functions - mike to experiment with a derived class for this..
	void Begin(void);
	void Loop(void);
	void End(void);

protected:
};

#endif

// Allow us to use the LoadImage function name
//#ifdef LoadImage
//#undef LoadImage
//#endif