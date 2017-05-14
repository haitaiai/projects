// Includes
#include "MemoryGameApp.h"

#include "Common.h"

// Namespace
using namespace AGK;

// important !!!
CMemoryGameApp	MemoryGame;

// constructor
CMemoryGameApp::CMemoryGameApp()
{ 
	// need to connect with windows programm
	ConnectApplication(this);

	// setup device features
	SetupDevice(DEVICE_WIDTH, DEVICE_HEIGHT, FULLSCREEN);

	// setup window name/title
	SetupTitle(TITLE);
}

void CMemoryGameApp::Begin(void)
{
	//	setup agk-application
	agk::SetVirtualResolution(DEVICE_WIDTH, DEVICE_HEIGHT);
	agk::SetClearColor(48, 48, 96);
	agk::SetSyncRate(60, 0);
	agk::SetScissor(0, 0, 0, 0);
}

void CMemoryGameApp::Loop(void) {
	agk::Print(agk::ScreenFPS());

	// update the screen
	agk::Sync();
}


void CMemoryGameApp::End(void)
{
}

