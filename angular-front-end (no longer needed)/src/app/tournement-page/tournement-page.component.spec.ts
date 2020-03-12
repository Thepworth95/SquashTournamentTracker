import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TournementPageComponent } from './tournement-page.component';

describe('TournementPageComponent', () => {
  let component: TournementPageComponent;
  let fixture: ComponentFixture<TournementPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TournementPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TournementPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
