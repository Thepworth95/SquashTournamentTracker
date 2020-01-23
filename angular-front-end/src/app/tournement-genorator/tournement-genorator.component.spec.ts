import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TournementGenoratorComponent } from './tournement-genorator.component';

describe('TournementGenoratorComponent', () => {
  let component: TournementGenoratorComponent;
  let fixture: ComponentFixture<TournementGenoratorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TournementGenoratorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TournementGenoratorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
